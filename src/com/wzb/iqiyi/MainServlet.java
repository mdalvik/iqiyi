package com.wzb.iqiyi;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.wzb.bean.IqiyiInfo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2016/6/6 0006.
 */
public class MainServlet  extends HttpServlet {

    private IqiyiInfo iqiyiInfo = new IqiyiInfo();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        try {
            InitIqiyi();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

             if(req.getParameter("authcookie")!=null)
             {
                 iqiyiInfo.getData().setAuthcookie(req.getParameter("authcookie"));
             }

        Gson gson = new Gson();
        resp.setContentType("application/json;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write(gson.toJson(iqiyiInfo));


    }

    private void InitIqiyi() throws IOException {

        String realPath = getServletContext().getRealPath("");
        File file =new File(realPath.toString()+"/WEB-INF","iqiyi.txt");
        FileInputStream fos=  new FileInputStream(file);
        int len = -1;
        byte [] buf = new byte [1024];


        ByteArrayOutputStream bos  = new ByteArrayOutputStream();

        while( (len = fos.read(buf))!=-1){

            bos.write(buf,0,len);

        }
        String data  = new String(bos.toByteArray(),"utf-8");
        Gson gson = new Gson();

         iqiyiInfo = gson.fromJson(data, IqiyiInfo.class);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         doGet(req,resp);
    }
}
