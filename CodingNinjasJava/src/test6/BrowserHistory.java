package test6;
import java.util.*;
public class BrowserHistory {
	
	private List<String> bh;
    private int i;
    private int e;
    
    public BrowserHistory(String homepage) {
        bh=new ArrayList();
        bh.add(homepage);
        i=0;
        e=0;
    }
    
    public void visit(String url) {
        i++;
        if(i<bh.size()){
            bh.set(i, url);
        }else{
            bh.add(url);
        }
        e=i;
    }
    
    public String back(int steps) {
        i=Math.max(i-steps,0);
        return bh.get(i);
    }
    
    public String forward(int steps) {
        i=Math.min(i+steps, e);
        return bh.get(i);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
