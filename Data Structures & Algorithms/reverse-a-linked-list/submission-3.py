# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
      stack = []
      cur = head
      new_head = ListNode()
      while cur:
        stack.append(cur.val)
        cur = cur.next
      cur = new_head
      while stack:
        cur.next = ListNode(stack.pop())
        cur = cur.next
      return new_head.next
      
      
      


        