
public class Main {
    public static void main(String[] args) {

        String inputFileName = "input.txt";
        String minTimeOut = "minTime.txt";
        String sumTimeOut = "sumTime.txt";
        String updateTimeOut = "updateTine.txt";
        String minTimeOutMid = "minTimeMid.txt";
        String sumTimeOutMid = "sumTimeMid.txt";
        String updateTimeOutMid = "updateTineMid.txt";

        InputCreator inputCreator = new InputCreator(inputFileName);
        inputCreator.createInput(100, 5);

        InputReader inputReader = new InputReader(inputFileName);
        Writer writer = new Writer();
        Middeler middeler = new Middeler();

        int n = 0;
        long min;
        long sum;
        long minSearchTime;
        long sumSearchTIme;
        long updateTime;
        long a;
        long b;
        while (inputReader.hasNext(n)) {

            SegmentTree st = new SegmentTree(inputReader.numArray(n));

            a = System.nanoTime();
            min = st.rMinQ(0, st.size());
            b = System.nanoTime();
            minSearchTime = b - a;
            writer.writeLine(minTimeOut, minSearchTime + " ");

            a = System.nanoTime();
            sum = st.rsq(0, st.size());
            b = System.nanoTime();
            sumSearchTIme = b - a;
            writer.writeLine(sumTimeOut,sumSearchTIme + " ");

            a = System.nanoTime();
            st.update(0, st.size(), 10);
            b = System.nanoTime();
            updateTime = b - a;
            writer.writeLine(updateTimeOut, updateTime + " ");

            n++;

        }
        //Нахожу средние значения из 5
        middeler.mid(minTimeOut, minTimeOutMid);
        middeler.mid(sumTimeOut, sumTimeOutMid);
        middeler.mid(updateTimeOut, updateTimeOutMid);
    }
}
