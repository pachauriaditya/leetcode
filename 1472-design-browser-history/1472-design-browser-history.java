class BrowserHistory {

    class ListNode {
        String data;
        ListNode back;
        ListNode next;

        ListNode(String data) {
            this.data = data;
            this.back = null;
            this.next = null;
        }
    }

    ListNode currentPage;

    public BrowserHistory(String homepage) {
        currentPage = new ListNode(homepage);
    }

    public void visit(String url) {
        ListNode newNode = new ListNode(url);

        currentPage.next = newNode;
        newNode.back = currentPage;

        currentPage = newNode;
    }

    public String back(int steps) {
        while (steps > 0) {
            if (currentPage.back != null) {
                currentPage = currentPage.back;
            } else {
                break;
            }
            steps--;
        }

        return currentPage.data;
    }

    public String forward(int steps) {
        while (steps > 0) {
            if (currentPage.next != null) {
                currentPage = currentPage.next;
            } else {
                break;
            }
            steps--;
        }

        return currentPage.data;
    }
}