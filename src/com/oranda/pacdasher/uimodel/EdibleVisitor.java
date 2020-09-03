package com.oranda.pacdasher.uimodel;

import com.oranda.pacdasher.uimodel.ghosts.Ghost;
import com.oranda.pacdasher.uimodel.visualobjects.Dot;
import com.oranda.pacdasher.uimodel.visualobjects.Energizer;
import com.oranda.pacdasher.uimodel.visualobjects.Fruit;

public interface EdibleVisitor {
    void visit(Fruit fruit);
    void visit(Dot dot);
    void visit(Energizer energizer);
    void visit(Ghost ghost);
}
