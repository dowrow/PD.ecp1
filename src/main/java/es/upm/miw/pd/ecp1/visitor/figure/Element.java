package es.upm.miw.pd.ecp1.visitor.figure;

public interface Element {
    void accept(Visitor v);
}
