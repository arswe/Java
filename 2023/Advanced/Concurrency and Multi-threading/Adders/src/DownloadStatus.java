import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private boolean isDone;
    // longAdder is more efficient than atomicInteger
    private LongAdder totalBytes = new LongAdder();
    // private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes.intValue(); // totalBytes.sum();
    }

    public void incrementTotalBytes() {
        totalBytes.increment(); // totalBytes.incrementAndGet();
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public void incrementTotalFiles() {
        totalFiles++;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
