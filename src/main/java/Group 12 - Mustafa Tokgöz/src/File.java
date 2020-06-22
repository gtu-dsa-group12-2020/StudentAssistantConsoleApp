public class File<E> {
    E data;

    public File(){
        data =  null;
    }
    public File(E data){
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
