package com.jspider.user.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponce {

	private String massage;
	private boolean success;
	private HttpStatus status;

}
