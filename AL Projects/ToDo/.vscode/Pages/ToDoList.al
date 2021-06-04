page 50101 ToDoList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = ToDo;
    CardPageId = ToDoCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(CreatedAt; Rec.CreatedAt)
                {
                    ApplicationArea = All;

                }
                field(DeadLine; Rec.DeadLine)
                {
                    ApplicationArea = All;

                }
                field(IsDone; Rec.IsDone)
                {
                    ApplicationArea = All;

                }
            }
        }
    }


}