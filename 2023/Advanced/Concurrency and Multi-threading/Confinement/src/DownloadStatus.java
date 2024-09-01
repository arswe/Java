public class DownloadStatus {
    private int totalBytes;
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public void incrementTotalFiles() {
        totalFiles++;
    }
}
