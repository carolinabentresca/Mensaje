package com.myapp.struts.action;

import com.myapp.struts.form.mensajeForm;
import com.myapp.struts.modelo.mensajeDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegistroAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String ERRORS = "errors";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ActionForward forward = new ActionForward();
        mensajeForm msj = (mensajeForm) form;
        mensajeDao dao = new mensajeDao();
        msj = dao.registrar(msj);
        if (msj != null) {
            forward = mapping.findForward(SUCCESS);
        } else {
            forward = mapping.findForward(ERRORS);
        }
        return forward;
    }
}
