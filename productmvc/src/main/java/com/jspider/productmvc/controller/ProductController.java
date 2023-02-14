package com.jspider.productmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspider.productmvc.pojo.Admin;
import com.jspider.productmvc.pojo.ProductPojo;
import com.jspider.productmvc.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("home")
	public String homePage(@SessionAttribute(name = "login", required = false) Admin login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}

		return "Home";
	}

	@GetMapping("/add")
	public String addProduct(@SessionAttribute(name = "login", required = false) Admin login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}

		return "AddProduct";
	}

	@GetMapping("/navbar")
	public String navbar() {
		return "Navbar";
	}

	@PostMapping("/addProduct")
	public String add(@SessionAttribute(name = "login", required = false) Admin login, @RequestParam String name,
			@RequestParam double price, @RequestParam String brand, @RequestParam String color, ModelMap map) {

		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}

		ProductPojo product = service.addProduct(name, price, brand, color);
		if (product != null) {
			map.addAttribute("product", product);
		} else {
			map.addAttribute("msg", "Data not added !!");
		}
		return "AddProduct";
	}

	@GetMapping("/search")
	public String search(@SessionAttribute(name = "login", required = false) Admin login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}
		return "SearchProduct";
	}

	@PostMapping("/searchProduct")
	public String serchProduct(@SessionAttribute(name = "login", required = false) Admin login, @RequestParam int id,
			ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}

		ProductPojo product = service.serchProduct(id);
		if (product != null) {
			map.addAttribute("product", product);

			return "SearchProduct";
		} else {
			map.addAttribute("msg", "Data Not Found !!");

			return "SearchProduct";
		}
	}

	@GetMapping("/update")
	public String updateProduct(@SessionAttribute(name = "login", required = false) Admin login, ModelMap map) {

		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}

		List<ProductPojo> allProduct = service.allProduct();
		map.addAttribute("allProduct", allProduct);
		return "UpdateProduct";
	}

	@PostMapping("/updateProduct")
	public String updateProduct(@SessionAttribute(name = "login", required = false) Admin login, @RequestParam int id,
			ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}
		ProductPojo product = service.updateProduct(id);
		if (product != null) {
			map.addAttribute("product", product);

			return "UpdateProductDetails";

		} else {
			map.addAttribute("msg", "Data Not Found");
			return "UpdateProduct";
		}
	}

	@PostMapping("/updateProductDetails")
	public String updateProductDetails(@SessionAttribute(name = "login", required = false) Admin login,
			@RequestParam int id, @RequestParam String name, @RequestParam double price, @RequestParam String brand,
			@RequestParam String color, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}
		ProductPojo product = service.updateProductDetails(id, name, price, brand, color);
		if (product != null) {
			map.addAttribute("msg", "Data Updated successfuly. ");
			List<ProductPojo> allProduct = service.allProduct();
			map.addAttribute("allProduct", allProduct);
			return "UpdateProduct";

		} else {
			map.addAttribute("msg", "Data Not Found");
			return "UpdateProduct";
		}
	}

	@GetMapping("/remove")
	public String remove(@SessionAttribute(name = "login", required = false) Admin login, ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}
		List<ProductPojo> allProduct = service.allProduct();
		map.addAttribute("allProduct", allProduct);
		return "RemoveProduct";

	}

	@PostMapping("/removeProduct")
	public String removeProduct(@SessionAttribute(name = "login", required = false) Admin login, @RequestParam int id,
			ModelMap map) {
		if (login == null) {
			map.addAttribute("msg", "Please Login First..!!");
			return "AdminLogin";
		}
		ProductPojo product = service.removeProduct(id);
		if (product != null) {
			List<ProductPojo> allProduct = service.allProduct();
			map.addAttribute("allProduct", allProduct);
			map.addAttribute("msg", "Data Remove successfuly. ");
			return "RemoveProduct";
		} else {
			map.addAttribute("msg", "Data Not Found");
			return "RemoveProduct";
		}
	}

	// ***************** Admin Part **********************//

	@GetMapping("/admin")
	public String admin(ModelMap map) {
		return "AdminLogin";
	}

	@PostMapping("/admin")
	public String adminLogin(HttpServletRequest request, @RequestParam String username, @RequestParam String password,
			ModelMap map) {
		Admin admin = service.adminLogin(username, password);
		if (admin != null) {
			HttpSession session = request.getSession();
			session.setAttribute("login", admin);
			session.setMaxInactiveInterval(60);
			return "Home";
		}
		map.addAttribute("msg", "Inavlid username or password..!!");
		return "AdminLogin";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Successfully Logout...!");
		return "AdminLogin";
	}
}
