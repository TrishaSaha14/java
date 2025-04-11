package hashmapImplementation;

public class HashMapImplementation {
	final int size = 16;
	Entry[] buckets = new Entry[size];

	private int getBucketIndex(int key) {
		return (Math.abs(Integer.hashCode(key))) % size;
	}

	public void put(int key, int value) {
		Entry newNode = new Entry(key, value);
		int index = getBucketIndex(key);
		System.out.println("The Entry is added at index: " + index);
//		if(buckets[index] == null) {
//			buckets[index]=newNode;
//			return;
//		}
		Entry current = buckets[index];

		while (current != null) {
			if (current.key == key) {
				current.value = value;
				return;
			}
			current = current.next;
		}

		newNode.next = buckets[index];
		buckets[index] = newNode;
		return;

	}

	public int getValue(int key) {
		
			int i = getBucketIndex(key);
			Entry current = buckets[i];
			while (current != null) {
				if (buckets[i].key == key) {
					return buckets[i].value;
				}
				current = current.next;
			}
		
		return -1;
	}

	public void display() {
		for (int i = 0; i < buckets.length; i++) {
			Entry current = buckets[i];
			while (current != null) {
				System.out.println("At index " + i + " the key and values are: ");
				System.out.println("Key: " + current.key + "  " + "value: " + current.value);
				current = current.next;

			}
			continue;
		}
	}

	public void delete(int key) {
			int i = getBucketIndex(key);
			Entry current = buckets[i];
			Entry prev = null;
			while (current != null) {
				if (current.key == key) {
					if(prev==null) {
						
						buckets[i]=current.next;
						current.next=null;
					}
					else {
						prev.next=current.next;
						current.next=null;
					}
//					Entry temp=current;
//					current = current.next;
//					temp.next=null;
//					buckets[i] = current;
					System.out.println("The key and value of key " + key + " deleted");
					return;
				}
				prev = current;
				current = current.next;
			}
			

		

	}

	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.put(10, 1);
		map.put(10, 2);
		
		map.put(42, 37);
		map.put(26, 10);
		map.put(20, 9);
		map.put(85, 60);
		map.put(40, 20);
		int val = map.getValue(26);
		if (val != -1) {
			System.out.println("The value of the key is: " + val);
		} else {
			System.out.println("The key is does not exist");
		}
		// map.display();
//		map.delete(85);
//		map.display();
		map.delete(10);
		map.display();
	}
}
