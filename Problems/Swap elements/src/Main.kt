// The array numbers already exists. Write only exchange actions here.
val temp = numbers[numbers.lastIndex]
numbers[numbers.lastIndex] = numbers[0]
numbers[0] = temp


// Method above this is better.
//val x = numbers[0]
//
//numbers[0] = numbers[numbers.length-1]
//numbers[numbers.length-1] = x

