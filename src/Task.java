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

    public void taskCompleted(){
        if (this.status.equalsIgnoreCase("completada")) {
            System.out.println("La tarea ya está completada");
        } else {
            this.status = "completada";
            System.out.println("Eatado de tarea actualizado: tarea " + this.getDescription() + " // " + this.getStatus());
        }
    }
}
