package katahistogram;

public abstract class HistogramViewer<T> {
    
    private Histogram<T> histogram;

    public HistogramViewer(Histogram<T> histogram) {
        this.histogram = histogram;
    }
    
    public abstract void show();

    public Histogram<T> getHistogram() {
        return histogram;
    }
}
