public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;
    private final Object totalBytesLock = new Object();
    private final Object totalFilesLock = new Object();


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        synchronized (totalBytesLock) { // this is the object we are locking on
            totalBytes++;
        }
    }

    public synchronized void incrementTotalFiles() {
        synchronized (totalFilesLock) { // this is the object we are locking on
            totalFiles++;
        }
    }

    public int getTotalFiles() {
        return totalFiles;
    }
}

