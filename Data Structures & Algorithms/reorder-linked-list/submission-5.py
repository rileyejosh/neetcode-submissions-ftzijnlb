# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:

        # add each node in list 
        node_list = []
        cur = head
        while cur:
            node_list.append(cur)
            cur = cur.next
        left = 0
        right = len(node_list)-1
        cur = head
        cur = head
        while(left <= right):
            cur.next = node_list[left]
            left+=1
            cur = cur.next
            cur.next = node_list[right]
            right-=1
            cur = cur.next
        cur.next = None
            




        