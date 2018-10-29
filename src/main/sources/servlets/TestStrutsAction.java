package servlets;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.apache.struts.action.*;

public class TestStrutsAction extends org.apache.struts.action.Action {


	    private final static String SUCCESS = "success";

	    public ActionForward execute(ActionMapping mapping,ActionForm form,
	           HttpServletRequest request,HttpServletResponse response) throws Exception {

	        TestStrutsActionForm helloWorldForm = (TestStrutsActionForm) form;
	        helloWorldForm.setMessage("Hello!");
	        return mapping.findForward(SUCCESS);

	    }
	
}
