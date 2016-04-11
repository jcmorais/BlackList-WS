package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlosmorais on 08/04/16.
 */
@WebService
public class BlackList implements BlackListInterface {
    private List<String> blackList;

    public BlackList(){
        this.blackList = new ArrayList<>();
        this.loadData();
    }

    @Override
    @WebMethod
    public String isNifOnTheList(String nif) {
        if(this.blackList.contains(nif))
            return "true";
        else
            return "false";
    }


    public void loadData(){
        for(int i = 200001000; i<200100000; i+=1000){
            this.blackList.add(""+i);
        }
        System.out.println(this.blackList.toString());
    }
}
