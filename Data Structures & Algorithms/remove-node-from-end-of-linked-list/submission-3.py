# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
       arr = []
       cur = head
       while cur:
        arr.append(cur)
        cur = cur.next
       cur = arr[0]
       dummy = ListNode()
       dummy.next = cur

       if len(arr) - n == 0:
        dummy.next = cur.next
        return dummy.next
    
       
       for i in range(len(arr)+1):
        if i == len(arr)-n:
            cur.next = arr[i].next
            break
        else:
            cur.next = arr[i]
            cur = cur.next
       return dummy.next
    
        

        


