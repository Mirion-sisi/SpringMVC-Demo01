package com.niit.handler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//注解   配置
@Controller
//@RequestMapping(value= "handler") //映射
@RequestMapping("handler")
public class SpringMVCHandler {
                                   //只拦截POST请求                           //拦截有参数user，如果设值user=zs必须值为zs
	@RequestMapping(value="welcome",method=RequestMethod.POST,params= {"user=zs","age!=23" })//映射   可以写在方法前，也可在类前面
	public String welcome() {
		return "success";   //views/success.jsp;本身会返回success但是通过视图解析器会增加前缀和后缀
	}//最后停留的地址还是/handler/welcome并不是/success因为默认使用请求转发的 跳转方式不会跳转页面
	
	
	                          //请求头在每个浏览器上不一样所以chrome上的请求头不能在IE浏览器上执行成功
	@RequestMapping(value="w2",headers= {"Accept=text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3","Accept-Encoding=gzip, deflate, br"})
	public String welcome2() {
		return "success";
	}
	
	@RequestMapping(value="w3/*/test")  //*任意字符0个或多个
	public String welcome3() {
		return "success";
	}
	
	
	@RequestMapping(value="w4/**/test")  //**任意目录
	public String welcome4() {
		return "success";
	}
	
	@RequestMapping(value="w5/a?c/test")  //单个字符
	public String welcome5() {
		return "success";
	}
	
	@RequestMapping(value="w6/{name}")  //(1)springMVC这样获取传值给@PathVariable的参数
	public String welcome6(@PathVariable("name")  String name) {//(2)获取参数name的值
		//String name = request.getParamater("name");  //普通的servle这样获取传值
		System.out.println(name);
		return "success";
	}
	

	
	
	
	
	
	

}
