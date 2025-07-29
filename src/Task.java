public class Task {
    private String description;
    private String status;
    
    public Task(String description, String status){
        this.description = description;
        this.status = status;
    }

    public String getDescription(){
        return description;
    }

    public String getStatus(){
        return status;
    }

    
}
