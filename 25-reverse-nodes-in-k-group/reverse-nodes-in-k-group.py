# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:
        if not head or k == 1:
            return head

        curr = head
        new_head = None
        tail = None

        while curr:
            # Step 1: Check if there are at least k nodes
            temp = curr
            count = 0
            while temp and count < k:
                temp = temp.next
                count += 1

            if count < k:
                if tail:
                    tail.next = curr
                break

            # Step 2: Reverse k nodes
            group_head = curr
            prev = None
            next_node = None
            count = 0

            while curr and count < k:
                next_node = curr.next
                curr.next = prev
                prev = curr
                curr = next_node
                count += 1

            # Step 3: Connect reversed group
            if not new_head:
                new_head = prev
            if tail:
                tail.next = prev
            tail = group_head

        return new_head if new_head else head