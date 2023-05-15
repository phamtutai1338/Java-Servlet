<%--
  Created by IntelliJ IDEA.
  User: Tài
  Date: 15/05/2023
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*"  %>
<html>

<body>
    <!-- Step 1: Create HTML form -->
    <form action="dodo-list.jsp">
        Add new item: <input type="text" name="theItem"/>
        <input type="submit" value="Submit">
    </form>

    <!-- Step 2: Add new item to "To Do" list -->
<%
    // get the TO DO items form the session
     List<String> items = (List<String>) session.getAttribute("myToDoList");
     //if the To DO items doesn't exist,them create a new one
        if(items == null){
            items = new ArrayList<String >();
            session.setAttribute("myToDoList", items);
        }
     // see if there is form data to add
     String theItem = request.getParameter("theItem");
     if (theItem != null){
         items.add(theItem);
     }
%>
    <!-- Step 3: Display all "To Do" item from session -->
    <hr>
    <b>To List Items:</b><br/>
    <ol>
     <%
         for (String temp : items){
             out.println("<li>" + temp + "</li>");
         }
     %>
    </ol>
</body>
</html>
