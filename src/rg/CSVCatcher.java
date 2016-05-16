
    package rg;

    import java.io.IOException;
    import java.io.InputStream;
    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;

    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;

    import org.apache.commons.fileupload.FileItem;
    import org.apache.commons.fileupload.FileUploadException;
    import org.apache.commons.fileupload.disk.DiskFileItemFactory;
    import org.apache.commons.fileupload.servlet.ServletFileUpload;

    import rg.in.LicenceRecord;

    /**
     * Servlet implementation class CSVCatcher
     */
    @WebServlet("/CSVCatcher")
    public class CSVCatcher extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
        /**
         * @see HttpServlet#HttpServlet()
         */
        public CSVCatcher() {
            super();
            // TODO Auto-generated constructor stub
        }

    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html");
    		response.getWriter().append("no upload to process<br /><br /> Go to <a href=\"Loader\">upload</a> page");	
    	}

    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            ArrayList<LicenceRecord> licence_records = null;
            if (isMultipart) {
            	System.out.println("----");
            	ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
                try {
                	List<FileItem> items = upload.parseRequest(request);
                    Iterator<FileItem> iterator = items.iterator();
                    while (iterator.hasNext()) {
                        FileItem item = (FileItem) iterator.next();
                        if (!item.isFormField()) {
                            InputStream fin = item.getInputStream();
                            rg.in.FileParser parser = new rg.in.FileParser();
                           // licence_records=parser.readFile(fin);
                            parser.readFile(fin);
                        }
                    }
                } catch (FileUploadException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            response.setContentType("text/html");
    		response.getWriter().append("ok");
        }

    }
