tableextension 50100 CusomterTableExtension extends Customer
{
    fields
    {
        // Add changes to table fields here
        field(50100; FavouriteBookId; Integer)
        {
            TableRelation = Book.Id;
            DataClassification = ToBeClassified;
        }
    }

}