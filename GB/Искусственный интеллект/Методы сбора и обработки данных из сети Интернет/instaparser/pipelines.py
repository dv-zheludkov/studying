# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://docs.scrapy.org/en/latest/topics/item-pipeline.html


# useful for handling different item types with a single interface
from itemadapter import ItemAdapter
from pymongo import MongoClient

class InstaparserPipeline:
    def __init__(self):
        client = MongoClient('localhost', 27017)
        self.mongo_base = client['instagram']

    def process_item(self, item, spider):
        collection_name = f"Instagram user {item['target_user']} {item['target_user_id']} {item['target_user_to_f_user_relation']}"
        collection = self.mongo_base[collection_name]
        collection.update({'_id': item['_id']}, item, True)
        return item
