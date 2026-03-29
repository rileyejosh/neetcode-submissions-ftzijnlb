# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        s = head
        f = head

        # find the middle
        while f and f.next:
            s = s.next
            f = f.next.next
        
        # reverse 2nd half
        r = None
        p = s
        while p:
            n = p.next
            p.next = r
            r = p
            p = n
            
        
        
        # # reorder by combining halves
        l = head
        d = ListNode()
        d.next = head
        while l and r and l != r :
            d.next = l
            l = l.next
            d = d.next
            d.next = r
            r = r.next
            d = d.next
        d = d.next





        
        

        
            