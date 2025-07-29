public class App {
    public static void main(String[] args) throws Exception {
        Project proyecto1 = new Project("Encuestas", "Generar encuestas a la poblacion local", 2);
        Task tarea1 = new Task("encuestar 5 personas de la terecer edad", "pendiente");

        proyecto1.showProject();
        proyecto1.addTask(tarea1);
        proyecto1.showProject();
    }
}
