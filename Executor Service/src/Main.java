void main() {

    ExecutorService executors = Executors.newFixedThreadPool(3);

    for(int i=0; i<10; i++){
        int taskId = i;
        executors.submit(() ->{
            IO.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
        });
    }

    executors.shutdown();

}
