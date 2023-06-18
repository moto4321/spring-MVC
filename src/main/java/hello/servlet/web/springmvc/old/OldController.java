package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/springmvc/old-controller") // 이건 스프링빈의 이름을 url로 맞춰놓은 것.
public class OldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
//        return null;
        return new ModelAndView("new-form"); // 논리적인 이름만 넣은 상태, 뷰리졸버에서 물리적인 이름으로 바꿀 예정
        // 그리고 resources/application.properties에서 다음을 추가
        // spring.mvc.view.prefix=/WEB-INF/views/
        // spring.mvc.view.suffix=.jsp
    }
}
