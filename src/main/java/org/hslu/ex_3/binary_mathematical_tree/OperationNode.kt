package org.hslu.ex_3.binary_mathematical_tree

class OperationNode<T : Number> {
    val value: Operation
    var leftOperator: OperationNode<T>? = null
    var rightOperator: OperationNode<T>? = null
    var leftNumber: NumericNode<T>? = null
    var rightNumber: NumericNode<T>? = null

    constructor(value: Operation, leftOperator: OperationNode<T>?, rightOperator: OperationNode<T>?) {
        this.value = value
        this.leftOperator = leftOperator
        this.rightOperator = rightOperator
    }

    constructor(value: Operation, leftNumber: NumericNode<T>, rightNumber: NumericNode<T>) {
        this.value = value
        this.leftNumber = leftNumber
        this.rightNumber = rightNumber
    }

    constructor(value: Operation, leftOperator: OperationNode<T>?, rightNumber: NumericNode<T>) {
        this.value = value
        this.leftOperator = leftOperator
        this.rightNumber = rightNumber
    }

    constructor(value: Operation, leftNumber: NumericNode<T>, rightOperator: OperationNode<T>?) {
        this.value = value
        this.leftNumber = leftNumber
        this.rightOperator = rightOperator
    }
}