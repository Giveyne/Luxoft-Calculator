package ru.luxoft.courses.hierarchy.operation;

import ru.luxoft.courses.hierarchy.Emmitent;

public class Operation {
    private OperationType operationType;
    private String name;
    private Emmitent emmitent;

    public Operation(OperationType operationType, String name, Emmitent emmitent) {
        this.operationType = operationType;
        this.name = name;
        this.emmitent = emmitent;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emmitent getEmmitent() {
        return emmitent;
    }

    public void setEmmitent(Emmitent emmitent) {
        this.emmitent = emmitent;
    }
}
