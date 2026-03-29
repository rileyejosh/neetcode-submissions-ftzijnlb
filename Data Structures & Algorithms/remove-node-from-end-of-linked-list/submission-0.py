# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
         arr = []
         # no need for counter
         # since list will index the nodes
         dummy = ListNode()
         dummy.next = head
         curr = head
         while curr:
            arr.append(curr)
            curr = curr.next
         curr = dummy
         target_idx = len(arr) - n
         for i in range( len(arr)):
            if i == target_idx:
                curr.next = arr[i].next
                break
            else:
                curr = curr.next
         return dummy.next
            
            
        

        