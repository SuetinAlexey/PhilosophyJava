package filters;

public class HighPass extends Filter {
    double cuttof;
    public HighPass(double cuttof){
        this.cuttof = cuttof;
    }
    public Waveform process (Waveform input) {
        return  input;
    }
}
