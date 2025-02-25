package org.hslu.ex_2

interface StackInterface {

    /**
     * Pushes a value to the stack.
     * @param value The value to push.
     * @return void
     */
    fun push(value: String)

    /**
     * Pops the top value from the stack.
     * @return The value that was popped.
     */
    fun pop(): String?

    /**
     * Peeks at the top value of the stack.
     * @return The value at the top of the stack.
     */
    fun peek(): String?

    /**
     * Returns the size of the stack.
     * @return The size of the stack.
     */
    fun size(): Int

    /**
     * Checks if the stack is empty.
     * @return True if the stack is empty, false otherwise.
     */
    fun isEmpty(): Boolean {
        return size() == 0
    }
}