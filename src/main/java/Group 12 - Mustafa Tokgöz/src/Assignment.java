// I change all E types to String type , There is a problem I think So I changed.
public class Assignment{
    private String filename;

    public Assignment(String file){
        this.filename = file;
    }

    public String getFile() {
        return filename;
    }

    public void setFile(String file) {
        this.filename = file;
    }
    public String toString() {
    	return " File Name= "+ filename;
    }
}
