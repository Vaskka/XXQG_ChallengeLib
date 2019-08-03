import re
import pymongo


class Exercise:

    @staticmethod
    def get_id(raw):
        res = re.match("^([0-9]+).*$", raw)
        if res:
            return res.group(1)

        return None
        pass

    def __init__(self, content, _id):
        self.content = content
        self.id = _id
        self.choose = []
        pass

    def append_choose(self, choice):
        self.choose.append(choice)

    def get_data(self):
        return {
            "eid": self.id,
            "content": self.content,
            "choose": self.choose
        }
        pass
    pass


def test(s):
    res = re.match("^[0-9]|[a-z]|[A-Z].*$", s)
    if res:
        return True
    return False


def init():
    with open("resource.txt", "r") as f:
        s = f.read()

    ss = s.split("\n")

    for item in ss.copy():
        if not test(item):
           ss.remove(item)

    return ss


def process(main_list, stack):
    for exercise in main_list:
        _id = Exercise.get_id(exercise)

        if _id is None:
            # exercise is choice
            main_content = stack[-1]
            main_content.append_choose(exercise)
            pass
        else:
            # exercise is content
            stack.append(Exercise(exercise, _id))
            pass

    pass


def save(stack):
    mongo_uri = "mongodb://127.0.0.1"
    coll_name = "lib"
    db_name = "xxqg"

    client = pymongo.MongoClient(mongo_uri)

    db = client[db_name]
    coll = db[coll_name]

    for item in stack:
        coll.insert_one(item.get_data())
        pass

    pass


def main():

    main_list = init()

    stack = []

    process(main_list, stack)

    save(stack)
    pass


if __name__ == '__main__':
    main()
