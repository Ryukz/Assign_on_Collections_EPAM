package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
    private static final Logger logger=LogManager.getLogger(App.class.getName());
    public static  void main(String args[])
    {
        Custom_List<Integer> l1=new Custom_List<>();
        logger.info("My Custom List");
        for(int i=1;i<20;i++)
            l1.add(i);
        logger.info("Size of my List :"+l1.size()+"");
        l1.display();
        l1.remove(2);
        logger.info("Size of my List :"+l1.size()+"");
        l1.display();

    }
}
