import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private final AtomicInteger totalBytes = new AtomicInteger(); // thread-safe
    private volatile boolean isDone; // not thread-safe
    private final AtomicInteger totalFiles = new AtomicInteger(); // thread-safe

    public AtomicInteger getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet(); // atomic operation (thread-safe) - no need to synchronize
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }

    public AtomicInteger getTotalFiles() {
        return totalFiles;
    }

    public void incrementTotalFiles() {
        totalFiles.incrementAndGet();
    }
}
