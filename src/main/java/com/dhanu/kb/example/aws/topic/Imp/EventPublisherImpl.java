package com.dhanu.kb.example.aws.topic.Imp;

import org.springframework.stereotype.Component;

import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.dhanu.kb.example.aws.topic.EventPublisher;

@Component
public class EventPublisherImpl implements EventPublisher
{

    @Override
    public void publish(String msg)
    {

        AmazonSNSClient snsClient = new AmazonSNSClient(
                new ClasspathPropertiesFileCredentialsProvider());
        snsClient.setRegion(Region.getRegion(Regions.US_WEST_2));
        String topicArn = "arn:aws:sns:us-west-2:663453924043:Sample_Topic_Dhanu";

        // publish to an SNS topic
        PublishRequest publishRequest = new PublishRequest(topicArn, msg);
        PublishResult publishResult = snsClient.publish(publishRequest);
        // print MessageId of message published to SNS topic
        System.out.println("MessageId - " + publishResult.getMessageId());

    }

}
