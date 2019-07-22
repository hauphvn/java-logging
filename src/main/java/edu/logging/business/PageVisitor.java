package edu.logging.business;

import edu.logging.model.Page;
import edu.logging.model.User;

public class PageVisitor {

    public void visit(User user, Page page){
        System.out.println(user + " visited " + page);
    }
}
