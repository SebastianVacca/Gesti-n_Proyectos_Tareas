public class Project {
    private String name;
    private String description;
    private Task[] tasks;
    private int countTask = 0;

    public Project(String name, String description, int maxTasks){
        this.name = name;
        this.description = description;
        this.tasks = new Task[maxTasks];
        System.out.println("Se ha creado el proyecto " + this.name + " con un máximo de " + maxTasks + " tareas");
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void addTask(Task task){
        if (this.countTask < this.tasks.length) {
            this.tasks[countTask] = task;
            this.countTask++;
            System.out.println("Tarea creada satisfactoriamente, agregada al proyecto: " + this.getName());
        } else {
            System.out.println("Error en cargar la tarea, el proyecto " + this.getName() + " no recibe más tareas");
        }
    }

    public void displayTasks(){
        System.out.println("Listado de tareas designadas en el proyecto" + this.getName());
        if (countTask == 0) {
            System.out.println("No hay tareas asignadas");
        } else {
            for (int i = 0; i < this.countTask; i++) {
                if (this.tasks[i] != null) {
                    System.out.println(" ->" + this.tasks[i].getDescription() + " //" + this.tasks[i].getStatus());
                }
            }
        }
    }

    public void showProject(){
        System.out.printf("""
                Nombre de proyecto: %s
                Cantidad de tareas establecidas: %d
                Descripción: %s%n
                """, this.getName(),this.countTask, this.getDescription());
    }
}
