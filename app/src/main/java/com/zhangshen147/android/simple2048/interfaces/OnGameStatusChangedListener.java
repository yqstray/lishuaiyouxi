package com.zhangshen147.android.simple2048.interfaces;


public interface OnGameStatusChangedListener {

    void onScoreChange(int score);

    void onGameNormal();

    void onGameFail(int score);

    void onGameSuccess(int score);

    void onGameSuccessFinally(int score);
}