# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        size = 0
        cur = head
        while cur:
            size+=1
            cur = cur.next
        N = size - n 
        cur = head
        if N == 0:
            dummy.next = cur.next
            return dummy.next
        dummy.next = cur
        nex = cur.next
        count = 1
        while cur:
            if count == N:
                cur.next = nex.next
                break
            else:
                count+=1
                cur.next = nex
                nex = nex.next
                cur = cur.next
        return dummy.next
        



        