/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contorller;

/**
 *
 * @author Sh
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WebRestController {
 
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello World from Restful API";
	}
}