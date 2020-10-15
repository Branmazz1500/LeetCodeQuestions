package FlightQuestions;

public class CircularQueueBuilder {
	static class MyCircularQueue {

		private int[] data;
		private int head;
		private int tail;
		private int size;

		/** Initialize your data structure here. Set the size of the queue to be k. */
		public MyCircularQueue(int k) {
			this.data = new int[k];
			this.head = -1;
			this.tail = -1;
			this.size = 0;
		}

		/**
		 * Insert an element into the circular queue. Return true if the operation is
		 * successful.
		 */
		public boolean enQueue(int value) {

			if (size < data.length) {
				size++;
				if (head == -1) {
					head = 0;
				}
				if (tail == -1) {
					tail = 0;
				} else {
					tail++;
					if (tail >= data.length) {
						tail = 0;
					}
				}
				data[tail] = value;
				return true;
			}
			return false;
		}

		/**
		 * Delete an element from the circular queue. Return true if the operation is
		 * successful.
		 */
		public boolean deQueue() {
			if (size > 0) {
				data[head] = 0;
				head++;
				if (head > data.length) {
					head = 0;
				}
				size--;
				return true;
			}
			return false;
		}

		/** Get the front item from the queue. */
		public int Front() {
			if (size == 0) {
				return -1;
			}
			return data[head];
		}

		/** Get the last item from the queue. */
		public int Rear() {
			if (size == 0) {
				return -1;
			}
			return data[tail];
		}

		/** Checks whether the circular queue is empty or not. */
		public boolean isEmpty() {
			if (size == 0) {
				return true;
			}
			return false;
		}

		/** Checks whether the circular queue is full or not. */
		public boolean isFull() {
			if (size == data.length) {
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		MyCircularQueue circularQueue = new MyCircularQueue(6); // set the size to be 3
		System.out.println(circularQueue.enQueue(6)); // return true
		System.out.println(circularQueue.Rear()); // return true
		System.out.println(circularQueue.Rear()); // return true
		System.out.println(circularQueue.deQueue()); // return false, the queue is full
		System.out.println(circularQueue.enQueue(5)); // return 3
		System.out.println(circularQueue.Rear()); // return true
		System.out.println(circularQueue.deQueue()); // return true
		System.out.println(circularQueue.Front()); // return true
		System.out.println(circularQueue.deQueue()); // return true
		System.out.println(circularQueue.deQueue()); // return true
		System.out.println(circularQueue.deQueue()); // return true

	}
}
