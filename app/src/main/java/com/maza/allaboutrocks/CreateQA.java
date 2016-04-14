package com.maza.allaboutrocks;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by yswilliger on 4/13/2016.
 */
public class CreateQA extends Thread {


    private static final String TAG = QuizActivity.class.getSimpleName();
    public static String newQuestion;
    public static Handler handler;

    public static void getQuestion() {
        Random q = new Random();
        int choice = q.nextInt(4);
        newQuestion = Questions.question[choice];
        Log.i(TAG, newQuestion);
        Message message = Message.obtain();
        message.obj = newQuestion;
        QuizActivity qa = new QuizActivity();
        qa.handler.sendMessage(message);
}

    }

