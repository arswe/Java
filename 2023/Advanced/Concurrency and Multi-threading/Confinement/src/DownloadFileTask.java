public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) break;
            System.out.println("Downloading byte " + i);
            status.incrementTotalBytes();
        }
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
