package com.oranda.pacdasher.uimodel.visualobjects;

import com.oranda.pacdasher.uimodel.PacDasher;

public interface Edible {
    int getScoreValue();
    void accept(PacDasher packdasher);
}
