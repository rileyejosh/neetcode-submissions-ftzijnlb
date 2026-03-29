# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        a = []
        cur = head
        while cur:
            a.append(cur)
            cur = cur.next
        l = 0
        r = len(a) - 1
        cur = head
        while l <= r:
            cur.next = a[l]
            l+=1
            cur = cur.next
            cur.next = a[r]
            r-=1
            cur = cur.next
        cur.next = None



        