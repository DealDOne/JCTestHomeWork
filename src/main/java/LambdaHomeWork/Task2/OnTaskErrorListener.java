package LambdaHomeWork.Task2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String errorResult);
}